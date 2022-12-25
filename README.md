# kotlin-blackjack

## step2: 블랙잭

- 입력
  - [] 사람 이름 입력
    - [] null or 빈 문자열일 경우 예외 발생
    - [] 쉼표 기준으로 분리
      - [] 쉼표 존재하지 않을 경우 예외 발생
    - [] 이름 좌,우 공백 trim
  - [] 카드 뽑기 여부 입력
    - [] null or 빈 문자열일 경우 예외 발생
    - [] 한 글자가 아닐 경우 예외 발생
- 도메인
  - [x] 카드 52장 생성
    - [x] Heart, Spade, Clover, Diamond 무늬별 13장 생성
  - [x] 카드 뽑기
    - [x] 뽑을 카드가 없을 경우 예외가 발생한다.
  - [x] 카드 추가하기
    - [x] 중복된 카드일 경우 예외가 발생한다. 
  - [x] 카드 합 계산
    - [x] King, Queen, Jack = 10
    - [x] Ace = 1 / 11
  - [x] 게임 참여자 생성
    - [x] 이름이 빈 문자열일 경우 예외가 발생한다.
    - [x] 카드가 2장이 아닐 경우 예외가 발생한다.
    - [x] 초기 카드 2장의 합이 21일 경우, 블랙잭 상태로 변경된다.  
    - [x] 카드를 추가하고 그에 따른 상태를 변경
    - [x] stay 상태로 변경
  - [x] 플레이어 상태
    - [x] 카드의 합 = 0 -> Idle 
    - [x] 카드의 합 < 21
      - [x] 더 이상 카드를 뽑을 수 없을 경우 -> Stay
      - [x] 카드를 추가로 뽑을 수 있을 경우 -> Hit
    - [x] 카드의 합 = 21 -> Black Jack
    - [x] 카드의 합 > 21 -> Burst
    - [x] 상태 확인
      - [x] 종료 (Stay, Black Jack, Burst)
      - [x] 진행 (Idle, Hit)
    
- 출력
  - [] 최초 카드 배분 결과 출력
  - [] 사람이 가지고 있는 카드 출력
  - [] 게임 결과 출력