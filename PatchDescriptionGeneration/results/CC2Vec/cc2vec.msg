cursortobulkcursoradapter . close must call mcursor . close instead of mcursor . deactivate .
remove spurious import
tweak comment
fix error in docking station on chunk unload , fixes # 2898
corrected pimage . setmodified ( ) so mx2 and my2 are width - 1 and height - 1 ,
fixed ontouch in scrollview or viewpager
branch action has only all option
dispose project message bus in lite tests
fix build
fixed flickering in the preview pane in refactoring preview
lps - 53113 add @ deprecated
fix typo .
use correct private key header byte in reg test mode .
removing unused imports .
change quartz2 endpoint to be a singleton
remove todo in telecommanager .
fixed error where negative byte values were read causing the datainputstream to throw an eofexception .
make go case sensitive language
fix issue with state reset
i inadvertently passed the wrong source in the compile - time refactoring .
fix typo which cause stack overflow if children ( ) was called
remove so_linger
update gutter size after setting linenumberconvertor
traversalrequirements now uses cantraverse
remove useless todo .
optimized imports
fix / buildcraft not working in singleplayer
investigating bz 59261
fix null top view crash
fix syntax error
reset the inverse of the modelview in resetmatrix ( ) .
added sqldialect
add npe protection
enable copy reference in modal context ( idea - 13942 )
remove warning
remove redundant modifier
fixed a compile error .
align mockito . after with mockito . timeout to take a long instead of int
fixes issue 732
set inherit_log4j default to false .
scripting changes
set cursorwindow native pointer to null rather than 0 when disposing
default native proto to correct port in config
branch action has only all option
help id ( idea - 137826 )
make force protected for sub - class access
do not configure undertow listeners as reversed with the reverse proxy
fix incorrect hashcode implementation for abstracttype
fix leakage
fix builder crash # 21
avoid " invalid state " assertion ( ideadev - 21852 )
added helper method for builder implementations
@ deprecated does not have effect in groovy
changing viewclient to default visibility
removed unnecessary tag
expose network_score_service as @ systemapi .
remove a log
remove extra import in businesssubscriptiontransitionrecorder
fix transaction ( ) returning null
started new demo .
fixed cce ( ea - 38206 ) .
remove redundant onpause from readerwebview when hiding view
fix tests returning correct text range from pre - format processor .
lps - 45573 add line breaks since i assume order matters
added a todo about merging python scope - related code
revert since it breaks a unit test
disable broken inspection by default
make force protected for sub - class access
fixed max size of library slots , close # 1710
fix memory leak ( also delete the best model ) .
returning the defaultcatalogname if it is not null .
remove double up unregistering mpackagebroadcastreceiver
add a missing wifi p2p discovery changed broadcast
don ' t show empty python code style settings page ; fix python preview text
don ' t show empty python code style settings page ; fix python preview text
graphservicebeanimpl always returns the same graph , even with routerid
disposing tree builder
added getter for floattexturedata . buffer
fixed javadoc
wake - up sleeping reader when stop is called
add an ensureopen check to publication . hasbeenconnected ( ) .
organize import .
return an empty pluginlist instead of null for the
deprecating externalresources .
revert change preventing null ssid in a wificonfiguration
lps - 50321 missing @ override
rogue line number for try / catch statement confuses ide debuggers
fix applicationinfo copy ctor
lps - 34194 remove unthrown exception
enable cleaner hack , so it consumes less disk space
remove unused import in bufferutils
fixed problem with wrong log configuration .
fixed a bug with how gcm service is constructed
fastarray doesn ' t overwrite tostring ( ) method
consider scene uninitialized after destroyscene ( )
fixed mersennerandom naming
still return a package suspsended dialog if there is no owner .
fix nullpointerexception in xml . tostring ( object , tagname )
decreasing default max connections per node to 10
fix a copy paste misprint
remove unused setter from httpconfiguration .
remove uninformative javadoc
fix syntax error
fixed rare npe after race condition
lowering max ful failed attempts to 3
remove key lookup for account screen ( not a good place )
change intsetiterator to public
removing nullable as property is set in creator to non null value .
fix crash when doing conferencing over wi - fi
removed a sysout i missed .
prevent new ripples when max reached
lps - 30392 users do not have access to a site ' s private pages while on permissions algoritm 1 or 2
throw assert
fixed bug in dumper ( compile - server ) .
fixed an issue where the tx log wasn ' t closed properly , leaving transactions not marked as finished .
dismiss system windows when search is launched .
ooops , really correct the spelling of pool now .
fastarray doesn ' t overwrite tostring ( ) method
added file referesh before showing merge dialog
fix layer drawable inflation
missing import
update ok button
avoid profile . gettimezone ( ) nullpointerexception
added private constructor .
remove destroyed audioplayer from list of audioplayers
fix bitmap tinting
fix issue with state reset
pass the long clickable setting to the underlying control
synchronize isclosed .
remove javadoc warning
fixed issue with implementation of getfiles in usagetarget
fix config option loading for titanfactory builder
fixed remove webiew bug
return the view even when timing out in waitforview
integrating removal of focustrackback for linux since it brings more troubles than fixes .
typo cont ' d ( remove deprecated method in trunk )
don ' t check items on selected gridview
invoke connection . close method to close es connection
tweak comment
remove useless println
fix build
fix recursion issue with new special item entity code .
stops ' late provide ' errors in es6 circular imports .
lps - 35256 fix broken test
lps - 50178 fix a presumably copy - paste issue
fix findbugs issues in this class
lps - 30392 users do not have access to a site ' s private pages while on permissions algoritm 1 or 2
lps - 27783 add method to workflowedmodel
fixed javadoc tag
fixed license
if null , check version .
fix layer drawable inflation
remove unused import .
make markupbuilder . getmkp ( ) return markupbuilderhelper instead of object
removed close ( ) override that did nothing and did not call super . close ( )
hs2 shutdownhookmanager holds extra of driver instance in nested compile
fix build break
removed extraneous whitespace from pull request
fix ambiguity due to null - compilation error
disable optimizations for interfaces
speed up user - switching wallpaper changes
fix bug 5121406 - actionbar . setlogo
found the corresponding unity class
initialize default project profile for template project
removed a sysout i missed .
added @ deprecated annotation to deprecated methods .
revert " changed power request to activation energy . "
remove unused import in bufferutils
if null , check version .
fix build due to added api
adjust performance expectations
lps - 24280 add comment
shorten the animation length to make it snappier .
lps - 47491 fix compile
lps - 24280 add comment
don ' t allow resize of param dialog .
removed unnecessary import
reset the atmospherefactory as well
removing console spam
lps - 47491 fix compile
revert " changed power request to activation energy . "
lps - 36595 do not display manage site membership in control panel when the site membership policy doesn ' t allow manual membership
fixed possible npe
disable renderthread
capitalize configurable name
have the final setvisibility cause a requestlayout .
initialize default project profile for template project
replace path separator characters
added a ms tag to the debug time system out
now closes readablebytechannel after it has been read .
added a @ since tag to the javadoc
replicate text and sounds settings for managed profile .
change autosave interval to 5 seconds
lps - 36115 fix incorrect logic ?
lps - 62799 fix nullpointer in test
using objectid constructor instead of massagetoobjectid factory method
fix labeladjust , set false to setconverged at init .
make sure .
