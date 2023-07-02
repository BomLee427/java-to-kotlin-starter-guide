package com.lannstark.lec11

/**
 * 코틀린에서 접근 제어를 다루는 방법
 * 1. 자바와 코틀린의 가시성 제어
 */

/**
 * public: 모든 곳에서 접근 가능
 * protected: 선언된 클래스 또는 하위 클래스에서만 접근 가능(같은 패키지 내 접근 가능이 빠짐)
 * - 코틀린은 패키지를 namespace를 관리하기 위한 용도로만 사용, 가시성 제어에는 사용하지 않음
 * - 그래서 default도 사라짐
 * internal: 같은 모듈에서만 접근 가능
 * - 모듈: 한 번에 컴파일 되는 Kotlin 코드
 * - Ant Task <Kotlinc>의 호출로 컴파일 파일의 집합
 * private: 선언된 클래스 내에서만 접근 가능
 */

/**
 * 기본 접근 지시어는 public
 */
