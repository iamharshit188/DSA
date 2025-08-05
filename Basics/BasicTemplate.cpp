#include <iostream>     // For input/output operations
#include <vector>       // For dynamic arrays
#include <string>       // For string operations
#include <algorithm>    // For sorting, searching functions
#include <queue>        // For queue and priority_queue
#include <stack>        // For stack operations
#include <map>          // For key-value pairs
#include <set>          // For unique elements
#include <unordered_map> // Hash table implementation
#include <climits>      // For INT_MAX, INT_MIN constants

using namespace std;    // Avoid writing std:: prefix

int main() {
  cout<<"Hello World";
 // cout<< is used to print something
int n;
cin >> n;                    // Read integer
cout << "Value: " << n << endl;  // Print with newline

string s;
cin >> s;                    // Read string (stops at whitespace)
getline(cin, s);            // Read entire line including spaces
cout << s;
   return 0;
}

