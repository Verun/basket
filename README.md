A simple Java app to prompt the user for some items, calculate the final cost and then output this cost.

Assumptions:
1. The basket of items must be read in from the command line, one by one.
2. The cost of items was not provided, so I came up with these and hard coded them for now.

BasketReader and ItemPriceProvider abstract away the fetching of a basket of items and the price of each item in that basket, respectively.

Main is the entry point for the app. Only a few tests have been added for now.

'mvn package' will build the jar file, and you can run it like so: java -jar /path/to/jarFile.jar


