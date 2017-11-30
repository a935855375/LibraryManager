package models

// 书的bean类
case class Book(id: Int,
                name: String,
                sdesc: String,
                desc: String,
                count: Int,
                tag: List[String],
                commentnum: Int,
                sumrate: Int,
                ratenum: Int,
                perlevel: Int,
                joindata: String,
                price: Double,
                collectioncount: Int,
                allpage: Int)

case class PreOrderBook(pid: Int,
                        bid: Int,
                        time: Long,
                        outdate: Int)

case class PreOrder(uid: Int, book: List[PreOrderBook])

case class UserBean(uid: Int,
                    mail: String,
                    password: String,
                    realname: Option[String],
                    grade: Option[String],
                    tel: Option[String],
                    qq: Option[String],
                    nickname: String,
                    sex: Option[String],
                    permission: Int,
                    signature: Option[String],
                    avatar: String,
                    activecode: Option[String]
                   )