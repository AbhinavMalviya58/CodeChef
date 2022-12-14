#include <iostream>
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t--){
	    int t;
	    cin>>n;
	    string s1;
	    string s2;
	    cin>>s1;
	    cin>>s2;
	    map<char,int>m;
	    for(int i=0;i<n; i++){
	        m[s1[i]]++;
	    }
	    map<char,int>mp;
	    for(int i=0 ; i<n; i++)
	    mp[s2[i]]++;
	    int x=0;
	    int y=0;
	    for(int i=0;i<s1.length();i++){
	        if(m.find(s1[i])!=m.end())
	        x = m[s1[i]];
	        if(m.find(s1[i])!=mp.end())
	        y = mp[s1[i]];
	        ans= max(ans,mon(x,y));
	    }
	    count<<ans<<endl;
	}
	return 0;
}
