# 사다리 게임

## 기능 요구사항

- 사다리 입력
    - 사다리 게임에 참여하는 사람에 이름을 최대5글자까지 부여할 수 있다.
    - 사람 이름은 쉼표(,)를 기준으로 구분한다.
    - 최대 사다리 높이를 입력 받는다.

- 사다리 생성
    - 사람 입력 수 만큼, 라인(Line)이 생성된다.
    - 사다리 타기가 정상적으로 동작하려면 라인이 겹치지 않도록 해야 한다.
        - |-----|-----| 모양과 같이 가로 라인이 겹치는 경우 어느 방향으로 이동할지 결정할 수 없다.
    - 라인의 좌표 값에 선이 있는지 유무를 판단한다.
        - 라인의 좌표 값에 선이 있는 경우 추가로 선을 생성할 수 없다. (겹치지 않도록 한다.)
        - 라인의 좌표 값에 선이 없는 경우 추가로 선을 생성할 수도 있고, 생성하지 않을 수도 있다. (랜덤)
    - 사다리 높이 만큼 라인들(Lines)이 생성되며 서로 다른 라인들에 대한 제약은 없다.

- 사다리 출력
    - 사다리를 출력할 때 사람 이름도 같이 출력한다.
    - 사람 이름을 5자 기준으로 출력하기 때문에 사다리 폭도 넓어져야 한다.

