添加单位，只需要对比单位一致的情况下两个长度

Tasking ：

1.  Given 10 meters and 9 meters

​    When compare these two length

​    Then return 10 meters is longer than 9 meters

2.  Given 9 meters and 10 meters

​    When compare these two length

​    Then return 9 meters is shorter than 10 meters

3.  Given 10 meters and 10 meters

​    When compare these two length

​    Then return 10 meters is equals to 10 meters

4.  Given 10 meters and 90 centimeters

​    When compare these two length

​    Then return not supported different units

5.  Given 10 meters and 10

    When compare these two length

    Then return not supported different units