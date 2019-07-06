class Train implements Runnable{

String arr[]={"chennai","mumbai","indore","delhi","bhopal","gandhinagar","patiala","ludhiana","chandigarh","jalandhar"};
 static int count=0;
void station(int id,String name){


for(int i=0;i<arr.length;i++){

if((id==i)&&(Thread.currentThread().getName()==name)){
System.out.println(Thread.currentThread().getName()+"is in "+arr[i]);
 count++;
}

}
try{
Thread.sleep(1000);
}
catch(Exception e){
e.printStackTrace();
}


}
void station1(int id,String name){
for(int i=0;i<arr.length;i++){
if((id==i)&&(Thread.currentThread().getName()==name)){
System.out.println(Thread.currentThread().getName()+"is in "+arr[i]);
 count++;
}

}
}

public void run(){
for(int i=0;i<=10;i++){
if(i%2==0){

station(i,"train1");}
else{
station1(i,"train2");
}
}
System.out.println(count);
}

}

 class Assignment1{

public static void main(String args[]){

Train t=new Train();
Thread train=new Thread(t,"train1");
Thread train1=new Thread(t,"train2");

train.start();


train1.start();

}
}

