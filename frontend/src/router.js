import Vue from "vue";
import VueRouter from "vue-router";
import boardList from "./components/board/boardList";
import insertBoard from "./components/board/insertBoard";

Vue.use(VueRouter);

const router = new VueRouter({
    mode : "history",
    routes : [
        {
            path:"/boardList",
            component : boardList
        },
        {
            path:"/insertBoard",
            component : insertBoard
        }
    ]
});

export default router ;