# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)


### 기능 요구사항

<details>
<summary> 이전 보기 </summary> 
<div>

| 1단계 - 학습 테스트 실습 |
| --- |
- [x] String 클래스에 대한 학습 테스트
- [x] Set Collection에 대한 학습 테스트

| 2단계 - 문자열 덧셈 계산기 |
| --- |
- [x] 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환
- [x] 앞의 기본 구분자(쉼표, 콜론)외에 커스텀 구분자를 지정할 수 있다.
- [x] 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw한다.

</div>
</details>

| 3단계 - 자동차 경주 |
| --- |
- [x] 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- [x] 사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- [x] 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
- [x] 자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.

  #### ✓ 피드백 (#3734) `진행중`
    - [x] 작성된 요구사항을 기반으로 테스트 케이스 생성
    - [x] UI 담당로직은 그 기능으로만 담당하고 있어야 함
    - [x] setDistance 와 isMove 메서드 조합
    - [x] 자동차의 묶음을 관리해주는 객체 `일급컬렉션`
    - [x] MVC 구조에 맞게 패키지를 분리