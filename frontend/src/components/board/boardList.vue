<template>
  <div class="hello">
        <h1>게시판</h1>
        <div><!-- 콤보박스 선택 type="value"-->
          <b-form-select  value="non" :options="options" class="mb-2 mr-sm-2 mb-sm-0">
          </b-form-select>
            <input type="text" id="param" >                
            <!--버튼 클릭시 get방식으로 값 요청--->
            <button  @click="getBoard()">검색</button>
        </div>
        <table>
            <thead>
                <tr>
                    <th>글번호</th>
                    <th>제목</th>
                    <th>작성자</th>
                    <th>작성일시</th>
                </tr>
                
            </thead>
            <tbody>
                <tr v-for="board in boards" :key="board.bnum">
                    <td>{{ board.bnum }}</td>
                    <td>{{ board.btitle }}</td>
                    
                    <td>{{ board.mid }}</td>
                    <td>{{ board.bregdate }}</td>
                </tr>
            </tbody>
        </table>
    </div>
</template>

<script>
import axios from "axios";

export default {
    name:"boardList",
    data(){
        return{
            boards:[],
            options:[ //select를 위한 선언
                {value:"non",text:"선택"},
                {value:"title",text:"제목"},
                {value:"mid",text:"작성자"},
            ]
        };
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
    }

};
</script>

<style>
table {
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