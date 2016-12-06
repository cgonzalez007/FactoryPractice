Lab #1 INSTRUCTIONS:
====================
In this lab you will revise our famous IndependentCopy program to use a 
simple Factory to inject the Reader and Writer strategy objects into the 
Copier class (the high-level classs in the DIP).

The current version creates these objects in the Driver class. You will need
to modify the Driver class to use a custom-built Factory object to provide
the Reader and Writer objects. This is similar to the demo in the
"factorpractice" sample package above.

You do not need to change any other classes. But you will need to create an
appropriately named factory class that has methods for create readers and 
writers.
