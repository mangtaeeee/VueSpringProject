<template>
  <form >
    <div>
      제목 : <input type="text" name="bTitle" v-model="boardinsert.bTitle">
      내용 : <input type="text" name="bContent" v-model="boardinsert.bContent">
      파일 : <input type="text" name="bFile" v-model="boardinsert.bFile">
      작성자 : <input type="text"  name="mId" v-model="boardinsert.mId">
    </div>
     <button  @click="insertBoard()" >전송</button>
  </form>
</template>

<script>
import axios from "axios";
export default {
    data(){
        return{
            boardinsert:{
                btitle:"",
                bcontent:"",
                bfile:"",
                mid:"",
            }
        };
    },
    methods:{
        insertBoard(){
            axios.post("api/insertBoard",{
                btitle:this.boardinsert.bTitle,
                bcontent:this.boardinsert.bContent,
                bfile:this.boardinsert.bFile,
                mid:this.boardinsert.mId
            })
                .then(response => {
                    alert("등록되었습니다.");
                    console.log(response);
                    this.$router.push("/boardList");
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