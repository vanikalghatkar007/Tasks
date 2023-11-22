package com.vani.SpringBootDemo.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.data.mongodb.core.mapping.Document;

import com.vani.model.Student;


class StudentTest {
@Test
void testStudentConstructor() {
Student s = new Student(1,"vani" ,20, 12345);
assertNotNull(s);
assertEquals("Pragathi", s.getName());
assertEquals(20, s.getAge());
assertEquals(12345.7, s.getSalary());
}
@Test
void testGettersAndSetters() {
Student s = new Student();
s.setID(1);
s.setName("vani");
s.setAge(20);
s.setSalary(12345);

assertEquals(1, s.getID());
assertEquals("vani", s.getName());
assertEquals(20, s.getAge());
assertEquals(12345, s.getSalary());
}

@Test
void testEqualityandHashCode() {
Student s1 = new Student(2,"vani" ,20, 12345);
Student s2 = new Student(3,"vani" ,20, 12345);
assertEquals(s1, s2);
assertEquals(s1.hashCode(), s2.hashCode());
}
@Test
void testToString() {
Student s = new Student(4,"vani" ,20, 12345);
String expectedToString = "Student(id=1, name=vani, age=20, salary=12345.7)";
assertEquals(expectedToString, s.toString());
}
}