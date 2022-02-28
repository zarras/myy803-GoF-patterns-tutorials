

/*
 * CONTEXT: 
 * Component is an abstract class with alternative implementations ConcreteComponentA, ConcreteComponentB, ...
 * We want to extend the concrete implementations in various possible ways like add new attributes, add new methods and so on.
 * 
 * PROBLEMS: 
 * The standard way to extend in OO is by inheritance. 
 * 
 * However, if we want to do various independent extensions this may lead to way 
 * too many classes, code duplication and so on.
 * 
 * Subclassing may also not be possible (eg due to final classes or single inheritance in Java. 
 */
interface Component {
	void operation();
}
