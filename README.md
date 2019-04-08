# ArrayListVSLinkedList
An analytical comparison of an ArrayList and a LinkedList

  To start my analysis, I want to discuss the similarities and differences between ArrayList and LinkedLists. Both are data structures that allow you to add or remove data elements in an organized list. They do this in slightly different ways. An ArrayList implements a concept called a dynamic array, which means it is resizable.  An ArrayList also has an index number assigned to every data element in the data structure. A LinkedList operates by taking each data element and placing it in a node. Each node has a reference (pointer) to the node before it and the node after it, creating a long string of nodes each pointing to the next. 
  
	In order to discover which is more efficient in what circumstance, I wrote code that timed how long it took for each array type to perform the "add" and "remove" functions at various points in a large data structure. My hypothesis was that because the ArrayList has an index, it would be able to perform these tasks much quicker than a LinkedList since the computer has to travel all the way through the list to get to the data element in question. 
	
	After writing and running my code I discovered that my hypothesis was partially correct. The table with the supporting data is at the end of the document. I found that in most cases, the ArrayList outperformed the LinkedList. Especially when adding/removing a data element in the middle of the list. The LinkedList had to travel halfway down the list to reach the middle which takes the same amount of time regardless of which side it came at it from. Because of this, it took way much time than the index method of the ArrayList. The only time the LinkedList outperformed the ArrayList was when adding and removing data elements from the beginning of the data structure. This makes sense because the LinkedList doesn't have to travel at all to reach the first node. The ArrayList can add or remove the first data element quickly as well, but afterwards must re-index every single data element afterwards since they will all be off by one after the action is complete. As far as the add and remove functions themselves, my results found that each function takes about the same amount of time regardless of which one you use. 
	
	In conclusion, my results show that in most cases an ArrayList should be used over a LinkedList. One of the few situations where LinkedList should be used is if adding and removing data from the beginning of the data structure. LinkedLists also have a problem where because each node in a LinkedList requires at least one pointer, it takes up more memory than an ArrayList, and using pointers also make it a more complicated data structure compared to an ArrayList. 
	
Below is the data from my program put into a table.
		 | ArrayList   | LinkedList   |
-----------------------------------------------
Get beginning	 | 750,770.22  | 1,714.34     |
Get 1/4		 | 367,601.58  | 1,298,178.01 |
Get 1/2		 | 165,013.22  | 3,432,907.9  |
Get 3/4		 | 59,862.17   | 1,970,199.93 |
Get end		 | 365.9       | 250.56	      |
-----------------------------------------------
Remove beginning | 575,568.5   | 308.23       |
Remove 1/4	 | 322,068.77  | 1,483,316.66 |
Remove 1/2	 | 172,819     | 3,243,963.98 |
Remove 3/4	 | 61,012.02   | 1,951,957.5  |
Remove end	 | 560.611     | 432.01       |

