#include<iostream>
using namespace std;
int main()
{
	for (int a = 1; a <= 9; a++)
	{
		for (int j = 1; j <= a; j++)
		{
			cout << j << "*" << a << "=" << j*a << " ";

		}cout << endl;

	}
	return 0;
}