#include<iostream>
using namespace std;

/*int gcd(int a, int b)
{
    if(a==0)
    {
         return 0;
    }
    return gcd(b%a, a);
}

int findGcd(int arr[], int n)
{
    int result = arr[0];
    for(int i=1; i<n; i++)
    {
        result =((arr[i] * result)/(gcd(arr[i], result))) ;
    }
    return result;
}
*/
int gcd(int a, int b)
{
    if (b == 0)
        return a;
    return gcd(b, a % b);
}

// Returns LCM of array elements
int findGcd(int arr[], int n)
{
    // Initialize result
    int ans = arr[0];

    // ans contains LCM of arr[0], ..arr[i]
    // after i'th iteration,
    for (int i = 1; i < n; i++)
        ans = (((arr[i] * ans)) /
                (gcd(arr[i], ans)));

    return ans;
}


int main()
{
    int n, T, i, j, ans;
    cin>>T;
    for(i=0; i<T; i++)
    {
        cin>>n;
        int arr[n];
        for(j=0; j<n; j++)
        {
            cin>>arr[i];
        }
        ans = findGcd(arr, n);
        cout<<ans<<endl;
    }
    return 0;
}
