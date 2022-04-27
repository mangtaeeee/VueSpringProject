<template>
  <form>
    <div>
      제목 : <input type="text" v-model="bTitle">
      내용 : <input type="text" v-model="bContent">
      파일 : <input type="text" v-model="bFile">
      작성자 : <input type="text" v-model="mId">
    </div>
     <button  @click="insertBoard()" >전송</button>
  </form>
</template>

<script>
import axios from "axios";
export default {
    data(){
        return{
            bTitle:"",
            bContent:"",
            bFile:"",
            mId:""
        };
    },
    methods:{
        insertBoard(){
            axios.post("/api/insertBoard",
                {btItle:this.bTitle,bContent:this.bContent,bFile:this.bFile,mId:this.mId}
            )
                .then(response => {
                    if (response == "sucess"){
                        this.$router.push("/boardList");
                    }
                })
                .catch(error => {
                    console.log(error);
                    alert("입력이 잘못 되었습니다 다시 입력해주세요.");
                });
        }
    }

};
</script>

<style>

</style>