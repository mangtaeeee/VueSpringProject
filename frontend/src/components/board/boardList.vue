<template>
  <div class="hello">
        <h1>게시판</h1>
        <div><!-- 콤보박스 선택 type="value"-->
          <b-form-select  v-model="type" :options="options" class="mb-2 mr-sm-2 mb-sm-0">
          </b-form-select>
            <input type="text" id="param" v-on:keyup.enter="SerchBoard()" v-model="param" :disabled="type == 'non'" >                
            <!--버튼 클릭시 get방식으로 값 요청--->
            <button  @click="SerchBoard()" >검색</button>
        </div>
        <table>
            <thead>
                <tr>
                    <th>글번호</th>
                    <th>제목</th>
                    <th>작성자</th>
                    <th>작성일시</th>
                    <th>삭제</th>
                </tr>
                
            </thead>
            <tbody>
                <tr v-for="board in boards" :key="board.bnum">
                    <td>{{ board.bnum }}</td>
                    <td>{{ board.btitle }}</td>
                    <td>{{ board.mid }}</td>
                    <td>{{ board.bregdate }}</td>
                    <td><button v-on:click="remove(board.bnum)">삭제</button></td>
                </tr>
            </tbody>
        </table>
        <b-button @click="insertBoard()" variant="outline-secondary" >글쓰기</b-button>
    </div>
</template>

<script>
import axios from "axios";

export default {
    name:"boardList",
    data(){
        return{
            boards:[],
            type:"non",
            param : "",
            options:[ //select를 위한 선언
                {value:"non",text:"선택"},
                {value:"title",text:"제목"},
                {value:"mid",text:"작성자"},
            ]
        };
    },
    methods:{
        SerchBoard(){
            axios.get("api/boardList",{
                params:{
                    type: this.type,
                    param:this.param
                }
            })
                .then(response => {
                    this.boards = response.data;
                })
                .catch(error => {
                    console.log(error);
                });
        },
        insertBoard(){
            this.$router.push("/insertBoard");
        },

        remove(bnum){
            axios.delete("api/boardDelete?bNum="+bnum)
                .then(response => {
                    console.log(response);
                    this.$router.go();
                })
                .catch(error => {
                    console.log(error);
                });
        }
    },
    created (){
        axios.get("api/boardList",{
        })
            .then(response => {
                console.log(response.data);
                this.boards = response.data;
            })
            .catch(error => {
                console.log(error);
            });
    },
    

};
</script>

<style>
table{
    border: 1px solid black;
    border-collapse: collapse;
    width: 1000px;
    height: 250px;
    margin-left: auto;
    margin-right: auto;
}
thead {
    border: 1px solid black;
    background-color: skyblue;
}

th, td, tbody{
    border: 1px solid black;
    border-collapse: collapse;
}

select ,input ,button {
    height : 29px;
}
</style>