import Vue from 'vue'
import Router from 'vue-router'
import SearchMain from '@/components/contents/SearchMain.vue'
import Home from '@/components/cmm/Home.vue'
import Join from '@/components/user/Join.vue'
import Login from '@/components/user/Login.vue'
import Product from '@/components/contents/Product.vue'
import Sale from '@/components/contents/Sale.vue'
import Buycar from '@/components/contents/Buycar.vue'
import BuycarSelectGoods from '@/components/contents/BuycarSelectGoods.vue'
import BuycarInsertContractorInfomation from '@/components/contents/BuycarInsertContractorInfomation.vue'
import BuycarInsertContractorInfomation2 from '@/components/contents/BuycarInsertContractorInfomation2.vue'
import Mypage from '@/components/carbook/MyPage.vue'
import MypageModify from '@/components/carbook/MypageModify.vue'
import MypageModifyCheck from '@/components/carbook/MypageModifyCheck.vue'
import SeenCar from '@/components/contents/SeenCar.vue'
import StationInfo from '@/components/carbook/StationInfo.vue'
import MapList from '@/components/carbook/MapList.vue'
import Condition from "@/components/recommend/condition.vue"
import RecommendContent from "@/components/recommend/recommendContent.vue"
import CarList from "@/components/company/carList.vue"
import chart from "@/components/company/chartExample.vue"
import companyHome from "@/components/company/companyHome.vue"
import customerDetail from "@/components/company/customerDetail.vue"
import companyMain from "@/components/company/companyMain.vue"
import CustomerList from "@/components/company/customerList.vue"
import recommendHome from "@/components/recommend/recommendHome.vue"
import SnsPage from "@/components/social/SnsPage.vue"
import SnsDetail from "@/components/social/SnsDetail.vue"


Vue.use(Router)

export default new Router({
    mode: 'history',
    base:process.env.BASE_URL,
    routes : [
        {path: '/searchmain', name: 'searchmain', component: SearchMain},
        {path:'/', name:'home', component : Home},
        {path:'/join', name:'join', component : Join},
        {path:'/login', name:'login', component : Login},
        {path:'/product', name:'product', component : Product},
        {path:'/mypage', name:'mypage', component : Mypage},
        {path:'/mypageModify', name:'mypageModify', component : MypageModify},
        {path:'/mypageModifyCheck', name:'mypageModifyCheck', component : MypageModifyCheck},
        {path:'/seencar', name:'seencar', component : SeenCar},
        {path:'/stationInfo', name:'stationInfo', component : StationInfo},
        {path:'/mapList', name:'mapList', component : MapList},
        {path:'/sale', name:'sale', component : Sale},
        {path:'/buycar', name:'buycar', component : Buycar},
        {path:'/buycarSelectGoods', name:'buycarSelectGoods', component : BuycarSelectGoods},
        {path:'/buycarInsertContractorInfomation', name:'buycarInsertContractorInfomation', component : BuycarInsertContractorInfomation},
        {path:'/buycarInsertContractorInfomation2', name:'buycarInsertContractorInfomation2', component : BuycarInsertContractorInfomation2},
        {path:'/sns', name:'snspage', component : SnsPage},
        {path:'/snsdetail', name:'snsdetail', component : SnsDetail},
        // 강성조꺼
        {path: '/customerDetail',name: 'customerDetail', component:customerDetail},
        {path: '/companyHome',name: 'companyHome', component:companyHome,children:
                [
                    {path: '',name: 'companyMain', component:companyMain },
                    {path: 'customerList',name: 'CustomerList', component: CustomerList},
                    {path: 'carList',name: 'CarList', component: CarList},
                    {path: 'chart',name: 'chart', component:chart},
                ]},
        {path: '/recommendHome',name: 'recommendHome', component:recommendHome, children:[
                {path: '',name: 'RecommendContent', component: RecommendContent},
                {path: 'condition',name: 'Condition', component: Condition},

            ]}

    ]
})