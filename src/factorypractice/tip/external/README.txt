Complex External Specification Demo:
===================================
In this demo we will demonstrate how to read an external config.properties
file manually, without help from Spring. What complicates this demo is the
fact that the Tip Calculator objects have constructors and these
constructors have parameters. So you can't just do a clazz.newInstance().

Instead we'll have to determine the constructor used and the type of 
parameters it requires. Then, we can use a constructor object to create the
instance with parameters:  constructor.newInstance(param1, param2).

An addition problem will be discussed: what happens when the interchangeable
nature of strategy objects falls apart do to constructor differences?

Also, what kind of data should be pre-configured in an external file? Do you
really think that data normally provided by a user at runtime should be
statically configured in a file?