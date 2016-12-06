Lab #2 INSTRUCTIONS:
====================
In this lab you will revise our famous IndependentCopy program again, to use a 
Factory to inject the Reader and Writer strategy objects into the 
Copier class (the high-level classs in the DIP).

However, this time you will use Spring to do this. If you need help you can
look at the sample in the "factorypractice.spring1" example package below.

Here's what you need:
1. A new Spring applicationContext.xml file -- you can just copy/paste one of the
   provided files in the "<default package>" and then rename it 
   "applicationContextLab2.xml". Names must be unique.
2. Now Edit the file as necessary to get it to do what you want.
3. Modify the Driver class to use Spring. See the sample in the 
   "factorypractice.spring1" example package below to see how to do this.