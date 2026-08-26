class demo{
	public static void main(String[]args){
	int n = 6;
	int count = 0;
	int i = 1;
	while(i <= n){
	if(n%i == 0){
	count++;
	}
	i++;
		}
	if(count == 2){
	System.out.println("prime");
	}
	else{
	System.out.println("not prime");
	}
		}
			}
