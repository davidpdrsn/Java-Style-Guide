Java Style Guide
================

This is the style guide that we will be following during OOPD at Copenhagen University. It highlights the most important and most common conventions for writing Java code.

**Words used:**

- "Avoid" means don't do this unless you have a good reason.
- "Don't" means there is never a good reason.
- "Prefer" indicates a better option and its alternative to watch out for.
- "Use" is a positive instruction.

See [Example.java](https://github.com/davidpdrsn/Java-Style-Guide/blob/master/Example.java) for an example of code following these rules.

Formatting
----------

- Don't write lines longer than 80 characters.
- Avoid methods longer than 10 lines.
- Don't write methods longer than 15 lines.
- Don't write classes that are longer than 150 lines.
- Use two spaces for indentation. No tabs.
- Write comments and all names in English. Danish code is confusing.
- Don't write comments for each single line. Write high level comments above classes or methods explaining what the code does, not how it does it.
- Don't include trailing whitespace.
- Use an empty line between method definitions.
- Don't use extra empty lines at the end and beginning of class/method definitions.
- Don't includes spaces before `()` or `[]` when writing or calling methods.
- Don't include a newline before `{}`.
- Use spaces around operators, except unary operators, such as `!`.
- Prefix calls to instance methods and accesses of instance variables with `this.` when inside a class.

Naming
------

- Use `lowerCamelCase` for variable/method names and `UpperCamelCase` for class/interface names.
- Prefer longer clearer names rather than shorter unclear names.
- Prefer code thats clear and easy to rather rather than unclear code that requires lots of comments.

Organization
------------

The order of things inside classes should be:

1. Static variables
2. Instance variables
3. Constructors
4. Static methods
5. Instance methods
6. Private static methods
7. Private instance methods

Writing the code
----------------

- Use Vim or Emacs (no Eclipse) and spend time learning/configuring your editor. Its your best friend :smile:
