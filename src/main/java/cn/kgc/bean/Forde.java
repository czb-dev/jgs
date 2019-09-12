package cn.kgc.bean;




public class Forde {
private Integer age;
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
private String name;
public Forde(Integer age, String name) {
	super();
	this.age = age;
	this.name = name;
}
@Override
public String toString() {
	return "Forde [age=" + age + ", name=" + name + "]";
}
}
