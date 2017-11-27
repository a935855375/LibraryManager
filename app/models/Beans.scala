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

case class User(uid: Int,
                mail: String,
                password: String,
                realname: String,
                grade: String,
                tel: String,
                qq: String,
                nickname: String,
                sex: String,
                permission: Int,
                signature: String
               )