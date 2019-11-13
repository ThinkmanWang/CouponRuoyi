<template>
    <div class="wrapper">
      FXXXXK
      <el-button
        type="primary"
        icon="el-icon-search"
        size="mini"
        v-hasPermi="['business:coupon:brand:list']"
        @click="handleQuery"
      >查询</el-button>

      <el-button
        type="primary"
        icon="el-icon-edit"
        size="mini"
        v-hasPermi="['business:coupon:brand:add']"
        @click="handleAdd"
      >添加</el-button>
    </div>
</template>
<style lang="scss" scoped>

</style>

<script>
    export default {
        name: "hello"
        , data() {
            return {}
        }
        , created() {
        }
        , mounted() {
        }
        , beforeDestroy() {
        }
        , watch: {}
        , computed: {}
        , methods: {
            handleQuery() {

            }
            , handleAdd() {

            }
        }
    }
</script>

