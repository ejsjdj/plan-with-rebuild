# Git Workflow

<br>

## 1. 브랜치 전략
- `main` : 안정된 코드 (최종버전)
- `develop` : 개발/리팩토링 작업 통합 브랜치
- `feature/<기능>` : 리팩토링, 개선 작업
- 브랜치는 단기간 유지 후 develop에 빠르게 병합 -> 충돌 가능성 최소화

<br>

## 2. 커밋 메시지 규칙
<타입>(<모듈>): <작업 내용> - <간단 설명>
- feat: 새로운 기능 추가
- refactor: 코드 구조 개선
- doc: 문서 작성/수정
- test: 테스트 작성/수정
- fix: 버그 수정

<br>

## 3. PR 작성
- PULL_REQUEST_TEMPLATE.md 참고

<br>

## 4. 코드 스타일
**네이밍**
- 클래스: PascalCase
- 메서드/변수: camelCase
- 상수: SCREAMING_SNAKE_CASE (단어 사이 _ + 모두 대문자)
- Vue 컴포넌트 파일 : PascalCase.vue

**들여쓰기**
- Backend(Java/Spring): 4칸 스페이스
- Frontend(Vue3/JS): 2칸 스페이스 

**주석**
- 클래스/메서드/중요 로직에는 주석 필수

**기타**
- 줄 길이: 80 ~120자
- 빈 줄: 클래스/메서드/논리 블록 사이 1~2줄
- 파일/폴더 구조: 기능별 구분
