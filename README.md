Meet the Danimal.

        _________         .    .
       (..       \_    ,  |\  /|
        \       0  \  /|  \ \/ /
         \______    \/ |   \  /
            vvvv\    \ |   /  |
            \^^^^  ==   \_/   |
             `\_   ===    \.  |
             / /\_   \ /      |
             |/   \_  \|      /
                    \________/

The Danimal is the nickname we have given my three year old nephew.  He loves sharks, cheese, dancing, and reading bedtime stories.

Attributes (instance variables)

hungerLevel

boredomLevel

tirednessLevel

To start the game the Danimal's hungerLevel is at 8, his boredomLevel is at 5, and his tirednessLevel is at 10.  The game ends when any of these levels are equal to or below zero.

Activities (methods)

1.  Let's Eat! - to address his hungerLevel
		hungerLevel + 3
		tirednessLevel - 1

2.  Let's Dance! - to address his boredomLevel
		boredomLevel + 6
		tirednessLevel - 1

3.  Let's Read a Bedtime Story! - to address his tirednessLevel
		tirednessLevel + 5
		hungerLevel - 2
		boredomLevel - 1

4.  Or we can be lame and do nothing...
		The tick method runs

5.  Exit the program.

Tick Method

After each turn - Danimal's levels are adjusted by the following ammounts:

	hungerLevel - 1

	boredomLevel - 2

	tirednesssLevel - 1










