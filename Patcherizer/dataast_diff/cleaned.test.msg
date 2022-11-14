Call close ( ) instead of deactivate ( ) in CursorToBulkCursorAdaptor . close ( ) 
Removed non - needed imports 
Put that coffee down . 
fix error in docking station on chunk unload , fixes # 2898 
Fix bug 558 , PImage . save ( ) method not working with get ( ) 
Changed the behaviour of sendKey so that any key event kan be sent 
Ninja - add debug log statement to mv builder scheduled at startup 
Cancel all pending root scan requests on dispose . 
adds TODO for instantiateCroutonView 
set component configurations correctly for trident spouts 
LPS - 50604 add @ Override 
Fixed bug in getType 
fixed data info merge issue . 
Remove stray import of java . util . List 
Fix ringback return value . 
Suppress another flaky test . 
allow panes to raise themselves again 
Added missing method to check if a BaseObject3D . java is visible . 
set origin type with normal type 
Don ' t draw the current state if we are forcing another invalidation . 
Fix typo which cause stack overflow if children ( ) was called 
Fixes 
destroy folding model in three - side viewer 
IDEA - 103375 Fix understanding Git submodule roots 
Commit actually correct VizModel fix . 
convert GitVersionTest to junit 
Tweak class loader 
Fix test failure on some platforms 
Add warning when getContext is null . 
Fix setReleaseLabel ( ) . 
canvas . rotate ( ) expects degrees 
Deprecate SQLDialect . POSTGRESPLUS 
Fixed problem with getHighestFnScope method 
don ' t need null check 
Remove accidental import 
Fix flag value collision 
close the OutputStream when audit has finished 
Initial support for I18n ruby find usages support + fixed tests on yaml backend 
Make gestures visible again . 
Remove dead variable _hdfsActive . 
Set TWLayoutManager to have vertical orientation by default 
Fix NPE in volley stream fetcher 
default native proto to correct port in Config 
fix bug in non - choreographer looper 
IDEA - 95867 please map an " XML Catalog " topic 
Make app module field private . 
Disable watch service based file watching for now 
Fix hashCode 
Fix test 
Actually set the autobind flag with the specified value ( # 1038 ) . 
removed normalize from lfw 
fixed multiple db calls 
 @ Deprecated does not have effect in Groovy 
Remove unused field from AssetManager . 
Removed unnecessary tag 
Make PhoneAccount . CAPABILITY_VIDEO_CALLING public 
move test file into temp folder 
Fix missing Date import in Restore . java 
Use this ( ) in constructor 
add Gpu - Image library 
Javac ( at least for 1 . 7 . 0_51 on Mac ) wants fully qualified class name 
Removed a TODO mark which is not going to be fixed ( it just works and is not reusable at this moment . ) 
Add GC thread to RSGL . 
Replacing correct XML tag on editing external annotations . 
Fix naming issue in comment 
Make final 
Make PyUnbound Local Variable inspection enabled by default 
rewrite readonly status dialog ( IDEADEV - 2453 , IDEADEV - 8703 , IDEADEV - 12772 ) 
Do not show article tab for non - articles 
update the conversations view ( and the lock icon ) after receiving device list 
fixed compilation error 
Fix leaked broadcast receiver 
Fixed action mode bug with select show on map in my tracks 
help ID ( IDEA - 57112 ) 
LPS - 48154 Expose it or else Eclipse complains 
Fix NPE in BrowseFragment header transition before API 19 
DomModelTreeView disposing fixed 
add method GraphTableCell . getRefsToThisCommit ( ) 
fixed javadoc 
Shutdown of OSoftThread now also interrupts the associated thread 
Add an ensureOpen check to Publication . positionLimit ( ) . 
Fix missing imports . 
invalidate WebView after Title change 
remove me note 
Initialize audio quality with NONE instead of AMR_WB . 
LPS - 33429 missing transactional annotation 
Rogue line number for try / catch statement confuses IDE debuggers 
Fix ApplicationInfo copy ctor 
LPS - 38606 Remove unthrown exception 
add todo 
remove unused import 
Identity . combine ( other ) should just return other . 
added type name . 
FastArray doesn ' t overwrite toString ( ) method 
Allow subclasses to fiddle with mSceneInitialized 
fixed previous check - in 
Send ACTION_DEVICE_POLICY_MANAGER_STATE_CHANGED Broadcast when a user restriction has been changed . 
XML object now cross references loadXML ref docs 
Revert " Decreasing default max connections per node to 10 " 
LPS - 55112 It ' s already static 
Remove empty destroy ( ) method from GLColorOverlay 
Fix docs typo in YUV code 
GRAILS - 6047 - this change may resolve GRAILS - 6047 , pending further investigation 
refresh settingsModified flag on apply ( ) 
Upped initial buffer size to 1K to be consistent with the pooled version 
FredrichO / JonathanL - fixed issue with views not recycling on media grid 
made FnExpr public 
Fix AbstractTFS compilation with hdfs1 
Add missing access check . 
Adding print to err stream when there ' s an HTTP call made that doesn ' t match any response rules . 
Prevent new ripples when max reached 
shutting down the listener thread properly { SMACK - 120 } 
Throw UnsupportedOperationException in not implemented method 
Fix a test failure after the timeout refactoring 
Add synchronization to close ( ) 
fixed # 1156 
Fixed small comments 
Fix bug in ByteBuffer . getAll if the list is empty 
Fixed a bug where the margins where not updated correctly 
Stop any running DHCP client before bringup up an Ethernet interface 
fixed compilation error for ' Html ' class usage . 
IDEA - 146663 Typing on the replace field causes search preview to refresh 
Migrate UI to supportsMultipleUsers ( ) . 
Add private constructor to tachyon . Format 
Properly remove references to the original CompilerInput after the hot - swap is done . 
Fix build 
set origin type with normal type 
Hopefully fix # 48 
add correct exception throw declaration to isScreenBrightnessBoosted . 
remove javadoc warning 
Fixed soft - dependencies broken by previous commit . 
Reduced visibility of AggregationOptions . Builder constructor to private 
Build layer immediately when setting it in ViewPropertyAnimator 
Initialize smartLockAutoFill again 
Fixed the check used to decide if it the given view id is from an action item or a simple view . 
typo cont ' d ( remove deprecated method in trunk ) 
removed assignment in PSurfaceJOGL 
update FileRequest 
add @ Deprecated to make sure it is not part of 1 . 0 . 0 API 
LRQA - 29060 Never set result to NULL 
extracted InvocationOnMock interface 
Fix small rendering bug when item is hovering over AdvancedSlot . 
Fix problem in mFileProjectionMap 
LPS - 48078 Add unit tests 
Changed min_adapter_stack to < = 
Fix FindBugs warning 
Fix NPE in style fragment parse 
LPS - 18821 Add it to the interface so it can be called ( in case it ' s needed in the future ) 
Fix javadoc of DBCursor # curr ( ) 
Updated the package description 
IDEA - 73567 SVN repository browser doesn ' t work for default project any more 
Add missing commit 
Missed import 
Fix deadlock in XMPPConnection while login and parsing stream features ( for Tigase servers ) 
Remove code highlighted as unused by UCDetector 
add filter and scope parameters when creating terms stats facet 
Fix build break 
fixed issue # 199 
Restore default favicon when page loads so as to prevent a favicon from the last webpage being used 
disable optimizations for interfaces 
Fix build due to merge of 7595842 and renaming due to 8eb87f0 
Fixed setter in RuntimeEnvironment ( lucene locking ) 
Fixed added whitespace in AbstractAtomicReferenceOperation . 
initialize codec list before MediaCodec . getCodecInfo ( ) 
Remove sysout 
Added missing @ Override annotation in NearCacheStats . 
Stack overflow fix 
remove an unused import 
Improved error handling when font loading fails . 
Make an internal class package private " 
Fix type in TwitterRestClient . 
Fix comment 
remove MAX_TRANSFERS from RepeatedRaptorProfileRouter ( not used ) . 
Revert " LPS - 37902 Deleting file entry types too " 
add a * 
Disabling all version removal for test 
removed unnecessary import 
DO NOT MERGE 2928156 Accessibility event ' s parcelableData property not nullified during recycling ( GINGERBREAD ) 
Remove duplicate code 
Removed @ Override annotation in JetContentBasedFileSubstitutor . getDecompiledPsiFile ( ) to avoid broken compilation . 
Changed power request to activation energy . 
Fix null check for BaseObj . equals . 
Fixed inverse of listener assignment . 
Disable RenderThread 
Removed CompositeRunner constructor with just a class 
Fix start delay jank in ViewPropertyAnimator 
fix missing processFormFields 
Improve street name display 
Removed the testing code 
Now closes ReadableByteChannel after it has been read . 
Remove misplaced @ return in JavaDoc 
Fix Visibility transitions canceling when nothing has changed . 
remove unused constant 
 ( If there is no error , do change the target 
make changelogParamters publicly accessable 
do not stop editing on isModified invokation 
update shelf on project open ( IDEADEV - 12518 ) 
Fix memory leak 
