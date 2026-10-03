# msa4-java

Java 기본 문법과 객체 지향 프로그래밍을 학습하는 소스 모음입니다. 주제별 클래스의 `main` 메서드를 실행하며 문법, 객체 관계, 컬렉션과 Stream의 동작을 확인합니다.

## 처음 시작하기

JDK 17을 준비합니다. IDE 프로젝트 설정도 JDK 17을 사용하며, Maven·Gradle 빌드 파일은 없습니다.

IntelliJ IDEA 등에서 프로젝트를 열고 `src`를 소스 루트로 지정한 뒤 [HiJava.java](src/com/msa4java/edu/HiJava.java)의 `main` 메서드를 실행하세요. 출력문을 바꾸고 다시 실행하면 출력 방식의 차이를 살펴볼 수 있습니다.

터미널에서는 저장소 루트에서 다음 명령으로 같은 예제를 컴파일하고 실행합니다.

```sh
javac -encoding UTF-8 -d out -sourcepath src src/com/msa4java/edu/HiJava.java
java -cp out com.msa4java.edu.HiJava
```

`out`은 컴파일 결과를 저장하는 폴더입니다. 다른 예제를 실행할 때는 소스 경로와 패키지를 포함한 전체 클래스 이름을 바꿔 주세요. 예를 들어 [MainOOP.java](src/com/msa4java/edu/oop/basic/MainOOP.java)는 `com.msa4java.edu.oop.basic.MainOOP`을 사용합니다.

## 주제별 탐색

| 주제 | 경로 | 학습 내용 |
| --- | --- | --- |
| 기본 문법 | [edu/](src/com/msa4java/edu/) | 변수, 연산자, 조건문, 반복문, 배열과 메서드 |
| 객체 지향 기초 | [oop/basic/](src/com/msa4java/edu/oop/basic/) | 클래스, 생성자, 접근 제어와 오버로딩 |
| 상속과 추상화 | [oop/inheritance/](src/com/msa4java/edu/oop/inheritance/), [oop/abstractclass/](src/com/msa4java/edu/oop/abstractclass/) | 상속, 추상 클래스와 인터페이스 |
| 제네릭과 컬렉션 | [generics/](src/com/msa4java/edu/generics/), [collection/](src/com/msa4java/edu/collection/) | 타입 매개변수와 컬렉션 사용 |
| 데이터 표현 | [date/](src/com/msa4java/edu/date/), [enumeration/](src/com/msa4java/edu/enumeration/), [erecord/](src/com/msa4java/edu/erecord/) | 날짜, 열거형과 record |
| 예외와 자원 관리 | [error/](src/com/msa4java/edu/error/) | 예외 처리와 try-with-resources |
| 함수형 표현 | [lambdaandstream/](src/com/msa4java/edu/lambdaandstream/) | 람다식과 Stream |

정규식 예제는 [Regex.java](src/com/msa4java/edu/Regex.java)에서 확인할 수 있습니다. 각 주제의 진입 클래스를 실행하고 함께 사용하는 클래스를 읽는 방식으로 학습하세요.

## 파일 입출력 실습

[TryWithResource.java](src/com/msa4java/edu/error/TryWithResource.java)는 실행한 작업 디렉터리의 `text.txt`를 쓰기 모드로 열어 내용을 덮어씁니다. 실행 설정의 작업 디렉터리와 해당 파일을 먼저 확인하세요.
