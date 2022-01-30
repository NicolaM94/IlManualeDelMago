package base.application.ilmanualedelmago.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Defines base class for Spell rappresentation in the application.
 * This will be a row in Room database
 */


@Entity
data class Spell (
    @PrimaryKey val uid:Int,
    @ColumnInfo(name="name") val name: String?,
    @ColumnInfo(name="desc") val desc: String?,
    @ColumnInfo(name="higher_level") val higher_level :String?,
    @ColumnInfo(name="saving_throw") val saving_throw :String?,
    @ColumnInfo(name="range") val range :String?,
    @ColumnInfo(name="components") val components :String?,
    @ColumnInfo(name="material") val material :String?,
    @ColumnInfo(name="ritual") val ritual :Boolean?,
    @ColumnInfo(name="duration") val duration :String?,
    @ColumnInfo(name="concentration") val concentration :Boolean?,
    @ColumnInfo(name="casting_time") val casting_time :String?,
    @ColumnInfo(name="level") val level :Int?,
    @ColumnInfo(name="school") val school :String?,
    @ColumnInfo(name="combat") val combat :String?,
    @ColumnInfo(name="preferred") var preferred :Boolean?

)
