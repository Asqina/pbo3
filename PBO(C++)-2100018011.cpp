#include<iostream>

using namespace std;

class KRS{
	public:
		void input();
		void cetak(int mhs, int matkul[50],string data[50][50]);
		
	private :
		string nama[50],  matkul[50][50], jenis[50];
		int jmlh_mhs,program,  jmlh_matkul[50], jk;
};

void KRS::input(){
	cout<<"Jumlah mahasiswa : ";
	cin>>jmlh_mhs;
	cout<<endl;
	
	for(int i=0;i<jmlh_mhs;i++){
		cout<<"Mahasiswa ke-"<<i+1<<endl;
		cout<<"Masukan nama : ";
		cin>>nama[i];
		pilih:
		cout<<"Jenis kelamin : "<<endl;
		cout<<"1. Perempuan"<<endl;
		cout<<"2. Laki-laki"<<endl;
		cout<<"Masukan jenis kelamin (1/2) : ";
		cin>>jk;
		cout<<endl;
		if(jk == 1){
			jenis[i]= "Perempuan";
		}
		else if(jk == 2){
			jenis[i]= "Laki-laki";
		}
		else{
			cout<<"Pilihan tidak ada.";
			goto pilih;
		}
		int j=0;
		cout<<"Jumlah matakuliah yang diambil : ";
		cin>>jmlh_matkul[i];
		while( j<jmlh_matkul[i]){
			cout<<"Mata kuliah ke-"<<j+1<<" : ";
			cin>>matkul[i][j];
			j++;
			}
		cout<<endl;
	}
	cout<<"-------------------------------------------------------"<<endl;
	cetak(jmlh_mhs, jmlh_matkul, matkul);
}

void KRS::cetak(int mhs, int matkul[50],string  data[50][50]){
	cout<<"Data yang sudah di isi : "<<endl;
	for(int i=0; i<mhs; i++){
		int j=0;
		cout<<"Mahasiswa "<<i+1<<endl;
		cout<<"Nama\t\t: "<<nama[i]<<endl;
		cout<<"Jenis Kelamin\t: "<<jenis[i]<<endl;
		cout<<"Mata kuliah"<<endl;
		do{
    	cout<<"matkul"<<j<<"\t\t: "<<data[i][j]<<"\n";
     	j++;
	 	}
		while (j<matkul[i]);	
		cout<<endl;
	}
}

int main(){
		cout<<"\t\t\tProgram input mata kuliah"<<endl;
		cout<<"---------------------------------------------------------------"<<endl;
		KRS x;
		x.input();
		return 0;
	}

/*
1. main program 		
2. variable				
3. tipe data			
4. for					
5.if
6.while					
7. do while				
8. array 1 dimensi		
9 array 2 dimensi		
10. input				
11. output				
12, komen
*/


