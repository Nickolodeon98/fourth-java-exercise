# 파일 입출력

파일 입출력에 관한 다양한 클래스를 사용해본다.

## FileReader 클래스

``파일을 바이트 하나씩 읽어오는 클래스``

## BufferedReader 클래스

``파일을 한 줄씩 읽을 수 있게 하는 클래스``

#### 활용 예제: 2021년 인구 이동에 관한 데이터를 읽어오는 프로그램 작성

``-> ParseAccordingly: 다양한 줄을 의도에 맞게 필요한 정보만 뽑아내주기 위한 인터페이스``

``-> ParseForPatients: ParseAccordingly 인터페이스 구현체로, 환자 정보에 대한 데이터만 뽑아낸다.``

``-> PraseForPopulationMovee: ParseAccordingly 인터페이스 구현체로, 인구 이동 정보에 대한 데이터만 뽑아낸다.``
