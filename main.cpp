#include<iostream>
#include<string>
using namespace std;
int main()
{
	string str;
	while(cin>>str)
	{
		if(str == "-1")
			break;
		cout<<str<<endl;

	}
	system("pause");
	return 0;
}
