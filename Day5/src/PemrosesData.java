public class PemrosesData<T> {

    T data;
    PemrosesData(T data){
        this.data = data;
    }

    T showData(){
        return data;
    }
}
