Jacey Jonson

Instructions for Running:
	- This coding challenge was completed using Java in Eclipse. Running the program in
	  eclipse or another Java based IDE would be preferable, but I've attached an executable
	  jar file in Github so the output can be run in the terminal
	- If using eclipse --> download files from Github and open them in eclipse using 
	  File -> Open Projects from File System and select them from File Explorer 
	- To run the executable jar file, navigate to where the file is stored from the 
	  terminal and run java -jar BertramChallenge.java

Assumptions: 
	- Each coworker will order their favorite drink everyday and the price of these
	  drinks will not fluctuate over a potentially large period of time
	- The order in which each coworker pays is not relevant to the coworkers
	- Only the 5 coworkers will buy coffee together -- no one will leave and no new
	  coworkers will be added until the schedule is complete
	- Coworkers agree to split the bill as close to evenly as possible to reflect the
	  cost of their respective drinks
	  
Entering Data:
	- Upon running the program you will be asked to enter first the name of the coworker 
	  followed by the price of their drink and repeat this for each of the 5 coworkes
	- This user input is performed in the console window so simply type the information
	  and hit enter to continue 
	- The coworker's name is expected to be a string and the coworker's drink price is expected
	  to be a double. The program should not let you input anything but a double for the drink
	  price
	- Once this information is entered, the total number of days for a complete even rotation
	  is printed along with the amount of days each coworker should pay
	- To get an apporximately 10-day schedule press enter and keep pressing enter for as many
	  days of the schedule as you want to see
	- Percentages are used to approximate an even rotation among coworkers for the 10 day period
	  but any rounding error from these percentages will be accounted for near the end of the 
	  entire defined pay rotation