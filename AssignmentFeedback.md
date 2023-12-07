
### List of Questions & Assumptions
* The program only covers English vowel and consonants
* What happens when you type in anything which is not a vowel -  special characters, numbers?
  * The program just ingores this and can still output the number of vowels/consonants
* What happens with empty strings?
  * Same answer as previous question.
* What format is the output suppose to take?
  * The json format given
* Is there a particular delimiter for the string in this case? 

### Code Review Feedback/Improvements
I would extend the program to capture upper case vowels and consonants
as this is not covered here. <br>
I refactored the CountResult function to make it easier to understand.

### Test Cases
* Can process strings with vowels and consonants - lower case.
* Does not throw errors if presented with strings containing special characters and capital letters
* When presented with 5 strings, an error is thrown NULL.
* When we get an empty list we should receive an empty list back.  
<br/><br/>


If I had more time I would create the following tests:
* The program shows an error message if - Extra arguments passed
* It can process up to 4 strings and throw an error. <br>
* Can process strings with vowels and consonants in the order we asked

### Bugs Found
* The maximum the program can process at one time are 3 strings instead of 4. If you try to process anymore an error is thrown - Extra arguments passed. 