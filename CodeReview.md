# Code Review

| ID# |       Location       |                                         Problem Description                                          | Category | Severity | 
|:---:|:--------------------:|:----------------------------------------------------------------------------------------------------:|:--------:|----------|
|  1  |  Game.java, line 13  |                                      Class vairable not private                                      |    CG    | low      |
|  2  | Game.java, line 129, | duplicate code, refactor to call super with default params and possibly combine method with initGame |    CS    | low      | 
|  3  | Game.java, line 95,  |                                   Missing proper header for method                                   |    CG    | low      |
|  4  | Game.java, line 109  |                      No space between ) and {. Inconsistent styling for methods                      |    CG    | low      |
|  5  |  Game.java line 87   |                                Stylinng for if else missing brackets                                 |    CG    | low      |                  
|  6  | Game.java, line 87,  |                               Duplicate code, could just return result                               |    CS    | low      |                                 
|  7  | Game.java, line 79,  |           Missing code to increment result if the guess word arraylist contains the letter           |    FD    | Major    |                        
|  8  | Game.java, line 78,  |                   Doesn't check if words in guesses contains the letter correctly                    |    FD    | Major    |            

                 