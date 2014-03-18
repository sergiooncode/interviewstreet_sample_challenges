# Sample challenges on InterviewStreet

<a href="https://www.interviewstreet.com/recruit2/">InterviewStreet</a> is a technical recruiting platform used by leading tech companies to hire the best programmers. 

On the website <a href="https://www.interviewstreet.com/recruit2/">InterviewStreet</a> there are 2 sample challenges: CARD SHUFFLING and QUEENS ON BOARD.

- Card Shuffling (30 Points)

Here is an algorithm for shuffling N cards:

1) The cards are divided into K equal piles.
2) The bottom N / K cards belong to pile 1 in the same order (so the bottom card of the initial pile is the bottom card of pile 1).
3) The next N / K cards from the bottom belong to pile 2, and so on.
4) Now the top card of the shuffled pile is the top card of pile 1. The next card is the top card of pile 2,..., the Kth card of the shuffled pile is the top card of pile K. Then (K + 1)th card is the card which is now at the top of pile 1, the (K + 2)nd is the card which is now at the top of pile 2 and so on.

For example, if N = 6 and K = 3, the order of a deck of cards "ABCDEF" (top to bottom) when shuffled once would change to "ECAFDB".

Given N and K, what is the least number of shuffles needed after which the pile is restored to its original order?

Input:
The first line contains the number of test cases T. The next T lines contain two integers each N and K.

Output:
Output T lines, one for each test case containing the minimum number of shuffles needed. If the deck never comes back to its original order, output -1.

Constraints:
K will be a factor of N.
T <= 10000
2 <= K <= N <= 10^9

Sample Input:
6

6 3

4 2

5 5

40 8

40 10

40 4

Sample Output:
6

4

2

20

5

10

-------------------------------------------------------

- Queens on Board

You have an N * M chessboard on which some squares are blocked out. In how many ways can you place one or more queens on the board such that no two queens attack each other? Two queens attack each other if one can reach the other by moving horizontally, vertically or diagonally without passing over any blocked square. At most one queen can be placed on a square. A queen cannot be placed on a blocked square.

Input:
The first line contains the number of test cases T. T test cases follow. Each test case contains integers N and M on the first line. The following N lines contain M characters each representing the board. A '#' represents a blocked square and a '.' represents an unblocked square.

Output:
Output T lines containing the required answer for each test case. As the answers can be really large, output them modulo 1000000007.

Constraints:
1 <= T <= 100
1 <= N <= 50
1 <= M <= 5

Sample Input:
4
3 3
...
...
...
3 3
.#.
.#.
...
2 4
.#..
....
1 1
#

Sample Output:
17
18
14
0 
