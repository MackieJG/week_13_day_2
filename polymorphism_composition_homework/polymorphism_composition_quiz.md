# Polymorphism & Composition Homework - Quiz

# Polymorphism

1. What does the ___word___ 'polymorphism' mean?
A. A core concept of OOP. It allows program to process objects differently based on their data-type or class.
    A class may need to define what happens in the method differently so the polymorphism allows us to do this.

2. What does it mean when we apply polymorphism to OO design? Give a simple Java example.
A. For example if we had an abstract class Shape and had two subclasses of Square and Circle. If we wanted
    to define the area of the shapes for a circle we would need to pass the appropriate parameters into the method necessary to calculate a circle i.e radius. Polymorphism would allow us to calculate the area of a circle. If we passed in length and width we could use the area method to calculate area. This is an example
    of method overloading. 

3. What can we use to implement polymorphism in Java?
A. Method overloading and method overriding. Method overloading was described as above. Method overriding is    calling the same function twice in two difference classes but overriding the output of the function based on
    the class needs.


4. How many 'forms' can an object take when using polymorphism?
A. Many forms. 

5. Give an example of when you could use polymorphism.
A. When sub/child classes inherent methods from the super/parent class using polymorphism the same method in
the parent class can function differently within the individual sub/children class. 




# Composition and Aggregation

6. What do we mean by 'composition' in reference to object-oriented programming?
Composition is similiar to inheritance in the sense its designed to make code reuseable. Composition is one form of association. Introducing composition gives us greater flexibility to dynamically change
the behaviours of our programs. 

7. When would you use composition? Provide a simple example in Java.
Composition is particular useful at the end of a sprint of the parameters change for a project. Do we need to dynamically change the behaviours of the program in a quick effective method then composition can aid that.

8. Give a difference between composition and aggregation?
Composition - when one of the classes dies the other class dies if composition is used to define the relationship.
Aggregation - classes can live indepedently from each other regardless if one of the classes disappears.


9. What is/are the advantage(s) of using composition/aggregation?
Reuse code, dynamically change object behaviours when necessary. Develop new relationships between classes 
that inherentence could not achieve. 

10. When using composition, when an object is destroyed, what happens to all the objects it is composed of?
Composition develops strong relationships bewtween classes therefore all objects are also destroyed. 

11. When using aggregation, when an object is destroyed, what happens to all the objects it is composed of?
Due to the loose relationship between aggreation classes they can remain if they have other properties to them.
