添加单位，只需要对比单位一致的情况下两个长度

Tasking ：

1.  Given 10 meters and 900 centimeters

​    When compare these two length

​    Then return 10 meters is longer than 900 centimeters

2.  Given 900 centimeters and 10 meters

​    When compare these two length

​    Then return 900 centimeters is shorter than 10 meters

3.  Given 10 meters and 1000 centimeters

​    When compare these two length

​    Then return 10 meters is equals to 1000 centimeters

4.  Given 10 meters and 10

    When compare these two length

    Then return not supported unknown units