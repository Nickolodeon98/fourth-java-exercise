# 대용량 파일 읽기 프로젝트 (620만건의 데이터) - 7초 가량 소요

파일 입출력에 관한 다양한 클래스를 사용해본다.

## FileReader 클래스

``파일을 바이트 하나씩 읽어오는 클래스``

## BufferedReader 클래스

``파일을 한 줄씩 읽을 수 있게 하는 클래스``

### 활용 예제: 2021년 인구 이동에 관한 데이터를 읽어오는 프로그램 작성

요구사항: Context 로직을 활용하여 parsing 로직을 재사용할 수 있도록 설계

``- ParseAccordingly: 다양한 줄을 의도에 맞게 필요한 정보만 뽑아내주기 위한 인터페이스``

``- ParseForPatients: ParseAccordingly 인터페이스 구현체로, 환자 정보에 대한 데이터만 뽑아낸다.``

``- ParseForPopulationMovee: ParseAccordingly 인터페이스 구현체로, 인구 이동 정보에 대한 데이터만 뽑아낸다.``

``- ParseForMapping: ParseAccordingly 인터페이스 구현체로, 시도 코드가 어떤 시도의 이름과 대응하는지에 대한 정보를 CSV 문자열로 바꾸어 준다.``

``- PopulationStatistics: 인구 이동 정보를 담은 CSV 파일을 읽고, 새로운 파일을 생성하며, 시도 코드의 대응 이름들에 관한 정보를 읽어들여 적절히 파싱해주는 sidoString 메서드를 구현하는 클래스``

``- sidoString: 시도코드를 시도의 이름으로 바꾸어주는 메서드, mappingInfo.txt에서 정보를 가져와서 변환 작업을 해준다.``

![image](https://user-images.githubusercontent.com/113348293/194482470-8976996d-c3dd-48e4-983e-dde5cbbf6707.png)

### 구현 결과 정보를 히트맵으로 나타낸 모습

![image](https://user-images.githubusercontent.com/113348293/194483743-5cd51775-384b-4381-8b42-22029767f42f.png)
