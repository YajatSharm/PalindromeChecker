# PalindromeChecker
Checks if a given word is a palindrome. In addition to this, it can also see if a word is a "space" palindrome. For example, "radar" is a palindrome but "r a dar" is not. However, it is a space palindrome.

The program incorporates the concept of recursion to accomplish the task. It begins by comparing the first and the last characters of the argument string and if they are the same, it creates a new string which is passed as the parameter for the recursive call to the same method. If a recursive call is made enough times, we will reach the base case which returns true because any word with 1 character or less is a palindrome. 

If at any point in a recursive call, the first and last character are not the same, we know that the word is not a palindrome and the function returns a boolean value of false and does not make another recursive call. 
