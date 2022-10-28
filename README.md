# SpringBoot-JUnit
  测试用例是每个开发必会的技能也是每个项目中不可获取的一项，本文介绍在如何在SpringBoot项目中使用Junit编写测试用例。
## JUnit

### JUnit的简单使用
使用Junit进行一个简单的输出
```java
public class JunitSimpleTests {
    @Test
    public void echo() {
        System.out.println("Hello World");
    }
}
```
以上代码中在echo方法上加上了@Test注解,表明这是一个测试方法，在下面的内容中会单独介绍Junit中的注解。

### JUnit中的注解

### 断言
  断言是测试用例中用来验证当前的运行结果是不是符合开发者期望，常见的断言类型有：

| method          | description                          |
| --------------- | ------------------------------------ |
| assertEquals    | 判断2个对象或者2个原始类型是否相等   |
| assertNotEquals | 判断2个对象或者2个原始类型是否不相等 |
| assertTrue      | 判断给定的表达式是不是为true         |
| assertFalse     | 判断给定的表达式是不是为false        |
| assertSame      | 判断给定的两个对象的引用是不是同一个 |
| assertNotSame   | 判断给定的两个对象的引用不是同一个   |
| assertNull      | 判断该给定的对象是否为null           |
| assertNotNull   | 判断给定的对象是否不为null           |
| ...             | ...                                  |

  更多断言的使用方法可以查看**org.junit.jupiter.api.Assertions**类，在后面的内容中会使用断言完成JUnit测试用例的编写。

### JUnit测试用例Demo

### 

## SpringBoot中测试用例的编写
