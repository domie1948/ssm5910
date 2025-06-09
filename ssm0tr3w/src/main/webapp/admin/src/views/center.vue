<template>
  <div>
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      label-width="80px"
    >  
     <el-row>
                              <el-col :span="12">
        <el-form-item  v-if="flag=='yonghu'"  label="用户名" prop="yonghuming">
          <el-input v-model="ruleForm.yonghuming" 
              placeholder="用户名" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item  v-if="flag=='yonghu'"  label="密码" prop="mima">
          <el-input v-model="ruleForm.mima" 
              placeholder="密码" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item  v-if="flag=='yonghu'"  label="昵称" prop="nicheng">
          <el-input v-model="ruleForm.nicheng" 
              placeholder="昵称" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item  v-if="flag=='yonghu'"  label="姓名" prop="xingming">
          <el-input v-model="ruleForm.xingming" 
              placeholder="姓名" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item v-if="flag=='yonghu'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie" placeholder="请选择性别">
            <el-option
                v-for="(item,index) in yonghuxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
                        <el-col :span="24">  
        <el-form-item v-if="flag=='yonghu'" label="头像" prop="touxiang">
          <file-upload
          tip="点击上传头像"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
          @change="yonghutouxiangUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item  v-if="flag=='yonghu'"  label="邮箱" prop="youxiang">
          <el-input v-model="ruleForm.youxiang" 
              placeholder="邮箱" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item  v-if="flag=='yonghu'"  label="手机" prop="shouji">
          <el-input v-model="ruleForm.shouji" 
              placeholder="手机" clearable></el-input>
        </el-form-item>
      </el-col>
                                                            <el-col :span="12">
        <el-form-item  v-if="flag=='huiyuanxinxi'"  label="用户名" prop="yonghuming">
          <el-input v-model="ruleForm.yonghuming" 
              placeholder="用户名" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item  v-if="flag=='huiyuanxinxi'"  label="昵称" prop="nicheng">
          <el-input v-model="ruleForm.nicheng" 
              placeholder="昵称" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item  v-if="flag=='huiyuanxinxi'"  label="会员号" prop="huiyuanhao">
          <el-input v-model="ruleForm.huiyuanhao" 
              placeholder="会员号" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item  v-if="flag=='huiyuanxinxi'"  label="密码" prop="mima">
          <el-input v-model="ruleForm.mima" 
              placeholder="密码" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item  v-if="flag=='huiyuanxinxi'"  label="姓名" prop="xingming">
          <el-input v-model="ruleForm.xingming" 
              placeholder="姓名" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item v-if="flag=='huiyuanxinxi'" label="会员类别" prop="huiyuanleibie">
          <el-select  @change="huiyuanxinxihuiyuanleibieChange" v-model="ruleForm.huiyuanleibie" placeholder="请选择会员类别">
            <el-option
                v-for="(item,index) in huiyuanxinxihuiyuanleibieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item  v-if="flag=='huiyuanxinxi'"  label="价格" prop="jiage">
          <el-input v-model="ruleForm.jiage" 
              placeholder="价格" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item  v-if="flag=='huiyuanxinxi'"  label="有效时间" prop="youxiaoshijian">
          <el-input v-model="ruleForm.youxiaoshijian" 
              placeholder="有效时间" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item  v-if="flag=='huiyuanxinxi'" label="开通日期" prop="kaitongriqi">
            <el-date-picker
                format="yyyy 年 MM 月 dd 日"
                value-format="yyyy-MM-dd"
                v-model="ruleForm.kaitongriqi" 
                type="date"
                placeholder="开通日期">
            </el-date-picker> 
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item  v-if="flag=='huiyuanxinxi'" label="到期日期" prop="daoqiriqi">
            <el-date-picker
                format="yyyy 年 MM 月 dd 日"
                value-format="yyyy-MM-dd"
                v-model="ruleForm.daoqiriqi" 
                type="date"
                placeholder="到期日期">
            </el-date-picker> 
        </el-form-item>
      </el-col>
                                                                                                                                                                        <el-form-item v-if="flag=='users'" label="用户名" prop="username">
        <el-input v-model="ruleForm.username" 
        placeholder="用户名"></el-input>
      </el-form-item>
      <el-col :span="24">
      <el-form-item>
        <el-button type="primary" @click="onUpdateHandler">修 改</el-button>
      </el-form-item>
      </el-col>
      </el-row>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isMobile,isURL,checkIdCard } from "@/utils/validate";

export default {
  data() {
    return {
      ruleForm: {},
      flag: '',
      usersFlag: false,
                                                                              yonghuxingbieOptions: [],
                                                                                                                                                            huiyuanxinxihuiyuanleibieOptions: [],
                                                                                                                                                                                                                };
  },
  mounted() {
    var table = this.$storage.get("sessionTable");
    this.flag = table;
    this.$http({
      url: `${this.$storage.get("sessionTable")}/session`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.ruleForm = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
                                                    this.yonghuxingbieOptions = "男,女".split(',')
                                                                                                        this.$http({
      url: `option/huiyuanleibie/huiyuanleibie`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.huiyuanxinxihuiyuanleibieOptions = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
                                                                                                                                          },
  methods: {
                                                                                                                                                    // 下二随
    huiyuanxinxihuiyuanleibieChange () {
      this.$http({
        url: `follow/huiyuanleibie/huiyuanleibie?columnValue=`+ this.ruleForm.huiyuanleibie,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          console.log('下2随')
                                                                                                                                                                        if(data.data.jiage){
                this.ruleForm.jiage = data.data.jiage
              }
                                                if(data.data.youxiaoshijian){
                this.ruleForm.youxiaoshijian = data.data.youxiaoshijian
              }
                                                                                                } else {
          this.$message.error(data.msg);
        }
      });
    },
                                                                                                                                                                                                    yonghutouxiangUploadChange(fileUrls) {
        this.ruleForm.touxiang = fileUrls;
    },
                                                                                                                                                                                                                                    onUpdateHandler() {
                              if((!this.ruleForm.yonghuming)&& 'yonghu'==this.flag){
        this.$message.error('用户名不能为空');
        return
      }
                                                            if((!this.ruleForm.mima)&& 'yonghu'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
                                                                                                                                                                                                                                                                                    if( 'yonghu' ==this.flag && this.ruleForm.youxiang&&(!isEmail(this.ruleForm.youxiang))){
        this.$message.error(`邮箱应输入邮箱格式`);
        return
      }
                                                                                                                                                                                                                        if((!this.ruleForm.huiyuanhao)&& 'huiyuanxinxi'==this.flag){
        this.$message.error('会员号不能为空');
        return
      }
                                                            if((!this.ruleForm.mima)&& 'huiyuanxinxi'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
                                                                                                            if((!this.ruleForm.huiyuanleibie)&& 'huiyuanxinxi'==this.flag){
        this.$message.error('会员类别不能为空');
        return
      }
                                                                                                                                                            if((!this.ruleForm.kaitongriqi)&& 'huiyuanxinxi'==this.flag){
        this.$message.error('开通日期不能为空');
        return
      }
                                                            if((!this.ruleForm.daoqiriqi)&& 'huiyuanxinxi'==this.flag){
        this.$message.error('到期日期不能为空');
        return
      }
                                                                                                                                                                                                                                          this.$http({
        url: `${this.$storage.get("sessionTable")}/update`,
        method: "post",
        data: this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "修改信息成功",
            type: "success",
            duration: 1500,
            onClose: () => {
            }
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
</style>
