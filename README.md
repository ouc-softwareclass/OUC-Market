# OUC-Market
为大学生提供便利的二手交易平台
# 实体类
## 商品类Commodity：
* name商品名称varchar
* price价格描述varchar
* image商品封面(待定)
* info商品详细信息varvhar
* detail商品详细图片(待定)
* owner拥有者User
* id数据库ID int
* state卖出状态boolean
* comment商品评论 varvhar<>//Comment

## 评论类Comment：

* itemId商品数据库编号ID int    ->找到commodity
* userId 评论者ID int    ->找到用户user
* time 评论时间DATETIME
* comments 评论内容varvhar

## 用户类User：

* userImage 用户头像（待定）
* userId用户ID varvhar
* password 密码 varvhar
* adress 地址 varvhar
* userName 用户名称 varvhar
* contact 用户联系方式varvhar
* upload 发布过的商品 commodity
* collection 收藏产品 commodity
