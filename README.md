# Prog5121Projectpart1
ChatApp – Login & Registration System

This is a small Java console app I built to practice input validation. It lets a user register an account with a username, password, and cellphone number, checks that everything is entered correctly, and then lets them try logging in with those same details.

How it works

When you run the app, it asks you for three things:

A username
A password
A cellphone number

Each one gets checked against a set of rules. If something's wrong, the app tells you exactly what to fix. If everything passes, registration is successful and you're taken straight into a login step, where you re-enter your username and password to make sure they match what you just registered.

The validation rules

Username
Needs an underscore (_) somewhere in it, and it can't be longer than 5 characters.

Password
Has to be at least 8 characters long, and include:

At least one capital letter
At least one number
At least one special character

Cellphone number
Needs to follow the South African format — starting with +27, followed by exactly 9 digits (e.g. +27821234567).

Files in this project
ChatApp.java – handles the actual program flow: asking for input, showing feedback, and running the login step.
Login.java – holds the user's data and does all the validation work behind the scenes.
Running it yourself

Make sure Java is installed, then:

javac ChatApp.java Login.java
java ChatApp

Follow the prompts and you're good to go.

Example run
Enter username: t_m
Enter password: Pass123!
Enter cellphone number: +27821234567

Username successfully captured.
Password successfully captured.
Cell phone number successfully added.

Registration successful!

Enter username to login: t_m
Enter password to login: Pass123!

Login successful. Welcome back!

