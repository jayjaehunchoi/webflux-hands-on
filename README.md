# webflux-hands-on

Spring WebMVC와 Spring Webflux의 성능을 비교한다.

### K6 스크립트
```javascript
import http from 'k6/http';

export let options = {
    vus: 100,
    duration: '10s',
};

export default function() {
	main()
}

function main() {
	let res = http.get(`{mvc / flux 요청}`);
}
```

### 실행 결과
* WebMVC
<img width="795" alt="image" src="https://user-images.githubusercontent.com/87312401/194195171-a7fdd2cd-aa7a-46c4-95eb-796e9e102e8b.png">

* Webflux
<img width="775" alt="image" src="https://user-images.githubusercontent.com/87312401/194195231-bae1e321-c54d-421c-82e4-2ca8f5a16f2f.png">


### 비교

| 내용      | MVC   | FLUX |
|---------|-------|------|
| latency | 7.85s | 2.03s|
| RPS | 9.8 | 48.9|

### 이유
WebFlux는 Netty를 사용 core 개수만큼 이벤트 루프를 생성하고, 요청을 보냄 Call back을 등록하고 바로 리턴 후 다음 작업 수행.

하지만 WebMVC는 병렬 스레드로 작동(컨텍스트 스위칭)하고 Blocking 방식의 httpclient를 사용하고 있어 웹 요청 후 스레드를 재할당하지 못함.

