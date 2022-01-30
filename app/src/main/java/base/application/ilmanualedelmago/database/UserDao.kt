package base.application.ilmanualedelmago.database

import androidx.room.Dao
import androidx.room.Query

@Dao
interface UserDao {

    @Query("SELECT * from spell")
    fun getAll() :List<Spell>

    @Query("SELECT * from spell ORDER BY level")
    fun getByLevel() :List<Spell>

    @Query("SELECT * FROM spell WHERE combat==(:combat) ORDER BY name")
    fun getByCombat(combat:String)

    @Query("SELECT * FROM spell WHERE school==(:school) ORDER BY name")
    fun getBySchool(school:String)

    @Query("SELECT * FROM spell WHERE preferred=='true'")
    fun getByPreferred()


}