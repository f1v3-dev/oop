# 데이터 중심의 영화 예매 시스템

> 이번 장에서는 데이터 중심의 설계에 대해서 알아보고, 객체지향적으로 설계한 구조와 어떤 차이점이 있는지 살펴보자.

데이터 중심의 설계란 객체 내부에 저장되는 데이터를 기반으로 시스템을 분할하는 방법이다.

책임 중심의 설계가 '책임이 무엇인가'를 묻는 것으로 시작한다면, 데이터 중심의 설계는 객체 내부에 저장해야 하는 '데이터가 무엇인가'를 묻는 것으로 시작한다.

## 설계 트레이드 오프

데이터 중심 설계와 책임 중심 설계의 장단점을 비교하기 위해 **캡슐화**, **응집도**, **결합도**를 비교해보자.

### 캡슐화

상태와 행동을 하나의 객체 안에 모으는 이유는 객체의 내부 구현을 외부로부터 감추기 위해서다. 이 때의 구현은 낮우에 변경 가능성이 존재하는 것을 말한다.

객체지향이 강력한 이유는 '변경'의 파급효과를 적절하게 조절하여 시스템 전체에 영향을 미치지 않도록 하는 것이다. 

> 변경 가능성이 높은 부분을 `구현` 이라고 부르며, 상대적으로 안정적인 부분을 `인터페이스` 라고 부른다.

객체지향에서 가장 중요한 원리는 캡슐화로 외부에서 알 필요가 없는 부분은 감춤으로써 대상을 단순화하는 추상화의 한 종류이다.

정리해보자면, 설계가 필요한 이유는 '요구사항이 변경되기 때문'이고, 캡슐화가 중요한 이유는 불안정한 부분과 안정적인 부분을 분리해서 '변경의 영향을 통제'할 수 있기 때문이다.

### 응집도와 결합도

응집도와 결합도는 구조적 설계 방법에서도 소프트웨어 품질을 측정하기 위해 소개된 기준이지만 객체지향 설계에서도 여전히 유효하다.

**응집도**

- 모듈에 포함된 내부 요소들이 연관되어 있는 정도
- 모듈 내 요소들이 서로 다른 목적을 추구한다면 낮은 응집도
- 객체지향 관점에서 응집도는 객체 또는 클래스에 얼마나 관련 높은 책임이 할당되었는지 나타냄

**결합도**

- 의존성의 정도를 나타내며 다른 모듈에 대해 얼마나 많은 지식을 가지고 있는지 나타내는 척도
- 다른 모듈에 대해 너무 자세한 지식을 가지고 있다면 높은 결합도
- 객체지향 관점에서 결합도는 객체 또는 클래스가 협력에 필요한 적절한 수준의 관계만을 유지하는지 나타냄

> **애플리케이션을 구성하는 각 요소의 응집도가 높고 서로 느슨하게 결합돼 있다면 그 애플리케이션은 좋은 설계를 가졌다고 볼 수 있다.**

- 응집도가 높다면, 요구사항이 변경되어도 오직 하나의 모듈만 수정하면 된다.
- 결합도가 낮다면, 하나의 모듈을 수정할 때 다른 모듈에 미치는 영향이 적다.

### 결합도가 높아도 되는 케이스

변경될 확률이 매우 적은 안정적인 모듈에 의존하는 것은 아무런 문제가 되지 않는다. 

- 표준 라이브러리에 포함된 모듈이나 성숙 단계에 접어든 프레임워크에 의존하는 경우
  - ex. Java - String, List ...

